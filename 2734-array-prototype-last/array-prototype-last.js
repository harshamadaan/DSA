/**
 * @return {null|boolean|number|string|Array|Object}
 */
Array.prototype.last = function() {  // here in function arr is not pass as param so we use this key to point out arr

if(this.length===0) return -1;

return this[this.length-1];
      
};

/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */