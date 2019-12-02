//for loop
var arr1=['toyota','honda','maruti','ford'];
for(var i=0;i<arr1.length;i++)
{
    console.log("array elements are:-",arr1[i]);
}

var beerbrands=['kingfisher','carlsberg','tuborg','bira'];
for(var i=0;i<beerbrands.length;i++)
{
    console.log("array elements are:-",beerbrands[i]);
}
var currency=['rupees','dollars','czech','euros'];
for(var i=0;i<currency.length;i++)
{
    console.log("array elements are:-",currency[i++]);
}
var cigrattes=['classic','luvin','total','black'];
for(var i=0;i<cigrattes.length;i++)
{
    console.log("array elements are:-",cigrattes[i]);
}
var processar=['dualcore','i5','i7','Amd','p4'];
for(var i=0;i<processar.length;i++)
{
    console.log("array elements are:-",processar[i]);
}


var expensivetoys =['audi','bmw','lamboghirni','benz','jaguar','ferrari'];
for(var i=0;i<expensivetoys.length;i++)
{
    console.log("array elements are:-",expensivetoys[i]);
}
var chai=['gingertea','lemon tea','blacktea','tulsitea'];
for(var i=0;i<chai.length;i++)
{
    console.log("array elements are:-",chai[i]);
}

var topservicecompany=['1.ustglobal','2.infosyis','3.capegemini','4.mphasis'];
for(var i=0;i<topservicecompany.length;i++)
{
    console.log("array elements are:-",topservicecompany[i++]);
}
var techno_iknow=['java','html','javascript','php'];
for(var i=0;i<techno_iknow.length;i++)
{
    console.log("array elements are:-",techno_iknow[i++]);
}
//for ofstarted
var currency=['rupees','dollars','czech','euros'];
for(var elements of currency)
{
    console.log("array elements are:-",elements);
}

var job=['fixedjob','unfixedjob(it job)','govtjob','business'];
for(ghap of job)
{
    console.log("array elements are:-",ghap);
}

var friends=['jigri friends','bff','kabhi kabhi milne waale','aur bhai kesaa hai wale'];
for(var fr of friends)
{
    console.log("array elements are:-",fr);
}


var arr1=['toyota','honda','maruti','ford'];
for(var me of arr1)
{
    console.log("array elements are:-",me);
}

var beerbrands=['kingfisher','carlsberg','tuborg','bira'];
for(var me of beerbrands)
{
    console.log("array elements are:-",me);
}
var currency=['rupees','dollars','czech','euros'];
for(var me of currency)
{
    console.log("array elements are:-",me);
}
var cigrattes=['classic','luvin','total','black'];
for(var me of cigrattes)
{
    console.log("array elements are:-",me);
}

var expensivetoys =['audi','bmw','lamboghirni','benz','jaguar','ferrari'];
for(var me of   expensivetoys)
{
    console.log("array elements are:-",me);
}
// for in loop
var arr1=['toyota','honda','maruti','ford'];
for(var key in arr1)
{
    console.log("array elements are:-",arr1[key]);
}
var beerbrands=['kingfisher','carlsberg','tuborg','bira'];
for(var key in beerbrands)
{
    console.log("array elements are:-",beerbrands[key]);
}

var brands=['calvinklen','tommyhilfiger','luisphillips','allensolly'];
for(var key in brands)
{
    console.log("array elements are:-",brands[key]);
}
var shampoo=['beershampoo','headand shoulder','sunsilk','dove'];
for(var ele in shampoo)
{
    console.log("array elements are:-",shampoo[ele]);
}

var cigrattes=['classic','luvin','total','black'];
for(var me in cigrattes)
{
    console.log("array elements are:-",cigrattes[me]);
}
var watches=['timex','fasttrack','titan','sonata'];
for(var me in watches)
{
    console.log("array elements are:-",watches[me]);
}
//for in loop

var person={
    name:'sundari',
    age:33,
    color:'white',
    }
    
    for( var key in person)
    {
        console.log('value=',person[key]);
    }
    
    var obj=[
        {
            obj1:'first',
            name:'ganesh gaitonde',
            value:100,
            position:'dharti ka iklauta bhagwaan'
        },
{
obj2:'second',
name:'guddu',
value:99,
position:'king of mirzapur'
}
    ]

for(var me in obj)
console.log(obj[me]);

var princess={
princess_name: 'elizabeth',
princess_color:'white af',
princess_revenue:99999999999,
}
for(ele in princess)
{
    console.log('princess :',princess[ele]);
}
var student={
name:'anonymous',
work:'chill',
revenue:'nalla',
job:'coder'
}
for(ele in student)
console.log("student properties are:-",student[ ele]);




//for each loop
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

var cigrattes=['classic','luvin','total','black'];
cigrattes.forEach(function(values,index){ console.log( index);})

var watches=['timex','fasttrack','titan','sonata'];
watches.forEach(function(i,j)
{
    console.log("array elements are:-",i);
})

var brands=['calvinklen','tommyhilfiger','luisphillips','allensolly'];
brands.forEach(function(i,j){
    console.log(i);
})
var items=[{ item: 'Purse',
    amount: 'nil',
    value: 'lot'},
    {
        item:'cigrate',
        amount:6700,
        value:'life' 
    }
]
items.forEach(function(value,args)
{
    console.log(value);
})