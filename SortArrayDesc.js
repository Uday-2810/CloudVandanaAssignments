const inputString = prompt('Enter a list of numbers:');
const inputArray = inputString.split(' ').map(Number);

// Check if the input is valid
if (!Array.isArray(inputArray) || inputArray.some(isNaN)) {
  console.log('Invalid input.');
}
else {
  // Sort the array in descending order
  inputArray.sort((a, b) => b - a);
  console.log('Sorted array in descending order: ' + inputArray.join(' '));
}

