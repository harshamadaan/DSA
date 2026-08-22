/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
    if(n===0){
        return arr.slice();
    }

    let flatter=[];

    for(let i=0;i<arr.length;i++){
        if(Array.isArray(arr[i])){
            const nested=flat(arr[i],n-1); //depth ko ek km krte jaao
            flatter.push(...nested);

        }else{
            flatter.push(arr[i]);
        }
    }
    return flatter;
    
};