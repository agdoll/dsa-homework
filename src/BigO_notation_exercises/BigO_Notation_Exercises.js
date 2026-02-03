
// Exercise 1
function sumArray(arr) {
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {   // one for loop, work grows linear
    sum += arr[i];
  }
  return sum;
}

// What is the time complexity?
// Your answer: O(n)


// Exercise 2
function printPairs(arr) {
  for (let i = 0; i < arr.length; i++) {    // nested for loop, work grows double n²
    for (let j = 0; j < arr.length; j++) {
      console.log(arr[i], arr[j]);
    }
  }
}

// What is the time complexity?
// Your answer: O(n²)


// Exercise 3
function compareLists(listA, listB) {
  listA.forEach(a => {  // independent linear  a
    console.log(a);
  });

  listB.forEach(b => { // independent linear b
    console.log(b);
  });
}

// What is the time complexity?
// Your answer: O(a+b)


// Exercise 4
function processData(arr) {
  // First loop: O(n)
  arr.forEach(item => console.log(item));

  // Nested loops: O(n²)
  for (let i = 0; i < arr.length; i++) {   // nested for loop, work grow double O(n²)
    for (let j = 0; j < arr.length; j++) {  // <--- work grows linear O(n)
      console.log(arr[i] + arr[j]);
    }
  }
}

// Initial complexity: O(n + n²)
// Simplified: O(n²) -->  drop the non-dominant term n


// Exercise 5
function createMatrix(n) {
  const matrix = [];

  for (let i = 0; i < n; i++) {    // nested
    matrix[i] = [];
    for (let j = 0; j < n; j++) {
      matrix[i][j] = i * j;
    }
  }

  return matrix;
}

// Time Complexity: O(n²)
// Space Complexity: O(n²)


// Exercise 6
// Current: O(n²) - finds if array has duplicates
function hasDuplicates(arr) {
    for (let i = 0; i < arr.length; i++) {
      for (let j = i + 1; j < arr.length; j++) {   // nested for loop, double checking per each element
        if (arr[i] === arr[j]) {
        return true;
      }
    }
  }
  return false;
}

// Optimize to O(n) using a Set or Object
function hasDuplicatesOptimized(arr) {
  let s = new Set();         // empty set to keep track of elements already checked

  for (let i = 0; i < arr.length; i++) { //
      if (s.has(arr[i])) {  // --> checks if the set has the array element saved
       return true;
      }
      s.add(arr[i]);  // -->  if not, adds the array element to the set and check next element.
  }
  return false;
}
