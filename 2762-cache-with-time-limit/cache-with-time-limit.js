class TimeLimitedCache{

    constructor(){
        this.cache=new Map();

    }
    // method define inside class

    set(key,value,duration){  //jb bhi duration ho to settimeout use

    const alreadyExists=this.cache.get(key);
    if(alreadyExists){
        clearTimeout(alreadyExists.timeoutId);
    }

    const timeoutId=setTimeout(()=>{
        this.cache.delete(key);  // ek duration tk hi rkhaga then delete

    },duration);

    this.cache.set(key,{value,timeoutId});  // hme value ot time dono chaiye to usko sath mai rakhna ke liya obj bnaya h
    return Boolean(alreadyExists)


    }
    get(key){
        if(this.cache.has(key)){
            return this.cache.get(key).value;
        }
        return -1;

    }
    count(){
        return this.cache.size;
    }
}