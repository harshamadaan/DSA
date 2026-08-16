/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {
   return new Promise(function(resolve){// hma resolve krana h to reject ko hta skte 
   setTimeout(resolve,millis);
    

   }) 
}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */