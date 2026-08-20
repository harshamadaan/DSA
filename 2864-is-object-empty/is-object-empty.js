/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {  // ya jo obj h vo array or obj dono ho kta h

    if(Array.isArray(obj)){   // array ke liya isarray check krega vo arr h ya ni
        return obj.length===0;
    }else{
        let arr=Object.keys(obj);  // obj.keys obj ki key ko arr mai store kr dega
        return arr.length===0;
    }
    
    
};