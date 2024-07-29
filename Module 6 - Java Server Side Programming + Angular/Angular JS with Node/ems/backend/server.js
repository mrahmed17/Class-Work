const express = require('express');
const multer = require('multer');
const path = require('path');
const fs = require('fs');

const app = express();
const PORT = 3000;

// Directory for storing uploaded files
const UPLOAD_DIR = 'uploads';

// Ensure the uploads directory exists
if (!fs.existsSync(UPLOAD_DIR)){
    fs.mkdirSync(UPLOAD_DIR);
}

const storage = multer.diskStorage({
  destination: (req, file, cb) => {
    cb(null, UPLOAD_DIR);
  },
  filename: (req, file, cb) => {
    cb(null, Date.now() + path.extname(file.originalname));
  }
});

const upload = multer({ storage: storage });

app.post('/upload', upload.single('profilePhoto'), (req, res) => {
  if (!req.file) {
    return res.status(400).send('No file uploaded.');
  }

  // Here you would typically update your user JSON data with the file path
  // For simplicity, we return the file path
  res.json({ filePath: req.file.path });
});

app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});
