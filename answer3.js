const arr = [1,2,[3,4,5],[6,7,8,9],10] 
console.log("Original Array: ",arr)
function flatten (arr) {
      var flattened_arr = [];
      for (var i = 0; i < arr.length; i++) {
        if (Array.isArray(arr[i])) {
          flattened_arr = flattened_arr.concat(flatten(arr[i]));
        } else {
          flattened_arr.push(arr[i]);
        }
      }
      return flattened_arr;
    }

    console.log("Flattened Array: ", flatten(arr))
