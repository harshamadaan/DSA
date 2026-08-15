/**
 * @param {Function} fn
 * @return {Function}
 */
// function memoize(fn) {
//     let cache={};
    
//     return function(...args) {
//         // let n=args[0]  ek hi arg
//         let n=JSON.stringify(args)

//         if(n in cache){
//             return cache[n];
//         }else{
//             // let result=fn(n)
//             let result=fn.apply(this, args);
//             cache[n]=result;
//             return result;
//         }
        
//     }
// }

// map
function memoize(fn) {
    let map=new Map();
    
    return function(...args) {
        // let n=args[0]  ek hi arg
        let key=JSON.stringify(args)

        if(map.has(key)){
            return map.get(key);
        }else{
            let value=fn(...args);
            map.set(key,value);
            return value;
        }
        
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */