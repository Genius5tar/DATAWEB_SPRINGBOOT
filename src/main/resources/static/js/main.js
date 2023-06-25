document.addEventListener("DOMContentLoaded", function() {
  var currencyCells = document.getElementsByClassName("currency");
  for (var i = 0; i < currencyCells.length; i++) {
    var value = parseFloat(currencyCells[i].textContent);
    currencyCells[i].textContent = value.toLocaleString(undefined, {style: "currency", currency: "COP"});
  }
});

