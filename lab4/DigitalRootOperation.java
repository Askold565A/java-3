package com.company.lab4;

public class DigitalRootOperation {
    public int caclDigitalRoot(int Number) {


    int Value = Number;
    int temp = 0;
	    while(Value /10>=1)

    {
        temp += Value % 10;
        Value /= 10;
    }

    temp +=Value;

	    if(temp /10>=1)

    {
        Value = temp;
        temp = 0;
        while (Value / 10 >= 1) {
            temp += Value % 10;
            Value /= 10;
        }
        temp += Value;
    }

        return temp;
}
}
