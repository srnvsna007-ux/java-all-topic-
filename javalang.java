class javalang
{
  void main()
    {
       //here Math is a class and sqrt is a method of Math class
        double s = Math.sqrt(25.0); 
      //here Math is a class and random is a method of Math class
       int randomvalue=(int)(Math.random()*10);
      //here Integer is a wrapper class and wrapper is an object of Integer class . auto boxing is done here
       Integer wrapper = 50;
       //here wrapper is an object of Integer class and unboxing is done here
       int unboxedvalue = wrapper;
      //here to print the values of s, randomvalue and unboxedvalue we are using IO class and println method of IO class
       IO.println(s+randomvalue+unboxedvalue);
    }
}