function calculatePrices() { 

   // Fetch input values
  let unitPrice = parseInt(document.getElementById("unitPrice").value) || 0;
  let quantity = parseInt(document.getElementById("quantity").value) || 0;
  let discount = parseInt(document.getElementById("discount").value) || 0;


  //  Calculate Total Price
  totalPrice = unitPrice * quantity;
  document.getElementById("totalPrice").value = totalPrice.toFixed(2);

  // Calculate Discount Amount
  let discountAmount = totalPrice * (discount / 100);
  document.getElementById("discountAmount").value = discountAmount.toFixed(2);

  //Calculate Actual Price
  let actualPrice = totalPrice - discountAmount;
  document.getElementById("actualPrice").value = actualPrice.toFixed(2);

};