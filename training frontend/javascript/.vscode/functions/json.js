const person={
name:'sumit raaaa',
age:21,
color:'white',
address:{

city:'mirzapur',
state:'karnatka',
pincode:590015

},
hobbies:['coding','birdwatching','singing']
}
console.log('js person object',person);
const jsonObject=JSON.stringify(person);
console.log('json person object',jsonObject);
const javaScriptPersonObject=JSON.parse(jsonObject);
console.log('javascript person object after parse',javaScriptPersonObject);

localStorage.setItem('email','billgates@gmail.com');
const emailID=localStorage.getItem('email');
console.log('email id is=',emailID);
localStorage.clear();

