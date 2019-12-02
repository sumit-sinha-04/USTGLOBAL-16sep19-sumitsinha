var random=function (radius)
{
var circum=2*3.14*radius;
console.log('the circumference of circle is',circum);
}
random(56);

var f=(radius)=> circum=2*3.14*radius;

console.log('new circum',f(34));

var add=(arr) => {

    var sum=0;
    for(var i=0;i<=arr.length-1;i++)
{
sum=sum+arr[i];
}
return sum;
}

    console.log( add([10,20,30,40]));

var tellprime=(num)=>{
var count=0;
    for(var i=2;i<=num/2;i++)
 {
    if(num%i==0)
 {
 count++;
}
 }
if(count===0)
console.log('it is prime congoz');
 
 else
 console.log('it is not a prime ');
}

tellprime(37);


