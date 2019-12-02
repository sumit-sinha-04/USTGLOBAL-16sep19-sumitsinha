function hoisting()
{
    
    console.log(hoistA);
    
    var hoistA=7;
}

hoisting();
function first()
{
setTimeout(function(){
    console.log('first function executed');
},0)
console.log('Executed');
}

function second()
{
console.log('second function executed');
}
first();
second();

   //for of loop

var brands=['kingfisher','hunter','carlsberg','oldmonk'];

for(var element of brands)
{
 console.log(element);

}
//for in loop
var brands=['kingfisher','hunter','carlsberg','oldmonk'];

for(var element in brands)
{
 console.log('brands=',brands[element]);

}
//
console.log("dbxfhn");

var person={
name:'sundari',
age:33,
color:'white',
}

for( var key in person)
{
    console.log('value=',person[key]);
}
console.log('hola');
var movies=['sholay','mayabazar','jurasic park','titanic'];
movies.forEach(function(value,index){
console.log('movie=',value);
});
// for each

var items=[{item:'bangles',
id:1,
price:100},
{item :'eyeliner',
id:2,
price:500},
{    item:'watch',
    id:3,
    price:5000  },
{ item:'bike',
    id:4,
    price:10000000       
}
]


items.forEach(function(value,index){            
   console.log("value of items",value); 
})
var name;
console.log(name);
var name='sumit';
var name='ritesh';

//let name;
let name='saho';
// name='love';
 
//
//const name;

