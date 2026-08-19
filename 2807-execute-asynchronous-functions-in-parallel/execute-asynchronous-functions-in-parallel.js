/**
 * @param {Array<Function>} functions
 * @return {Promise<any>}
 */
var promiseAll = function(functions) {
    return new Promise(function(resolve,reject){
        let res=Array(functions.length);
        let waitingFor=functions.length;

        for(let i=0;i<functions.length;i++){
            functions[i]()  // function jo abhi ith idx mtlb 0 pr h vo resolve reject ke liya execute hoga then next..
            .then((result)=>{
                res[i]=result;
                waitingFor--;
                if(waitingFor===0) resolve(res);
            })
            .catch(reject);
        }

    })
    
};

/**
 * const promise = promiseAll([() => new Promise(res => res(42))])
 * promise.then(console.log); // [42]
 */