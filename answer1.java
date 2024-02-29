public String[] makeArray(int num)  {    
	
	int min=-1;
	int max=100;
	int n=0;
	if (num >= min && num <=max){
    String[] arr=new String[num];
    for(int i=min;i=<num;i++){
		if (num % 3 && num % 5){
		{
			arr[i]="PopSnap";
			n=n+1;
			}
		else if (num % 3) {
			arr[i]="pop";
			n=n+1;
			}
		else if (num % 5){
			arr[i]="snap";
			n=n+1;
			}
    }
	
    return arr;
	}
}   