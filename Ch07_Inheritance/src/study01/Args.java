package study01;

class Args{
	int x;
	void add(int x){//숫자
		x = x + 50;//150
	}
	void add(Args arg){//주소
		arg.x = arg.x + 40;
	}
	void add(int[] arr){//배열
		arr[0]++;
	}
	void addNew(Args arg){//주소
		arg = new Args();
	}

}

