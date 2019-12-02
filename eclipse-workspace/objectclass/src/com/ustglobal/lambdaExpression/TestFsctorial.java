package com.ustglobal.lambdaExpression;

public class TestFsctorial {

	FactorialInterface f = (n)->{
		int facto=1;
		for (int i = 1; i <= n; i++) {
			facto = facto*i;
			
		}
;
	};
		
	int p= 	f.fact(5);

		}}

