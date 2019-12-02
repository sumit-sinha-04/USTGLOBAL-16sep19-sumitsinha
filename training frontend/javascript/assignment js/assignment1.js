//named function
function factorial(num)
{
    if (num ===0)
    return 1;
    else
    {
    var fact=1;
for(var i=1; i<=num;i++ )
{

    fact=fact*i;

}
return fact;
}
}
//named function in a variable
var f=factorial(4);
console.log('factorial of a no is:',f);
 //
 var fac=function (num)
 {
    if (num ===0)
    return 1;
    else
    {
    var fact=1;
for(var i=1; i<=num;i++ )
{

    fact=fact*i;

}
return fact;
}
 }

 console.log('factorial is',fac(6));

 //self invoked functions

(
    function( num){
    if (num ===0)
    return 1;
    else
    {
    var fact=1;
    console.log( fact);
for(var i=1; i<=num;i++ )
{
 fact=fact*i;
}
console.log( fact);
}
    }
    )(7);
//fat arrow expression
    var div=(num)=>{
        if (num ===0)
        return 1;
        else
        {
        var fact=1;
    for(var i=1; i<=num;i++ )
    {
    
        fact=fact*i;
    
    }
    return fact;
    }      
    }
console.log(div(2));
console.log('hello');

/*function fib(num)
{
var first=0;
var second=1;
 var next=first+second;
 if(num===0)
 console.log(0);
if(num===1)
{
    console.log('0 1' );
}
console.log('0');
console.log('1');
for(var i=1;i<=num;i++)
{
    console.log(second);
    first=second;
    second=next;
    next=first+second;
    
}
}

fib(10);
//using name function in a variable

var fibo= function(num)
{
var first=0;
var second=1;
 var next
 if(num===0)
 return(console.log(0));
if(num===1)
{
    return(console.log('0 1' ));
}
console.log('0');
console.log('1');
for(var i=1;i<=num;i++)
{
  console.log(second);
    first=second;
    second=next;
    next=first+second;
    
}
fibo(5);
}*/
 ( function (num)
    {
        var first=0;
        var second=1;
         var next=first+second;
         if(num===0)
         console.log(0);
        if(num===1)
        {
            console.log('0 1' );
        }
        console.log('0');
        console.log('1');
        for(var i=1;i<=num;i++)
        {
            console.log(second);
            first=second;
            second=next;
            next=first+second;
            
        }
        }
            )(5);

            
var f=(num)=> 
{
    var first=0;
    var second=1;
     var next=first+second;
     if(num===0)
     console.log(0);
    if(num===1)
    {
        console.log('0 1' );
    }
    console.log('0');
    console.log('1');
    for(var i=1;i<=num;i++)
    {
        console.log(second);
        first=second;
        second=next;
        next=first+second;
        
    }
    }

f(9);



