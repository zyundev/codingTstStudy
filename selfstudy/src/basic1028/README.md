# int로 양수값만 받고 최대값 늘리는 법

> int n = Integer.parseUnsignedInt(String s) ->  0 ~ 4294967295 범위의 정수
> 
> 위에 껏만 단독적으로 쓰면 오버플로우되어 -1출력됨
> 
> 그래서 온전한 값을 출력하기 위해서 Integer.toUnsignedString(n) 처리 해야 받을수 있음
> 
> 이것은 int의 범위를 늘리는 작업이 아닌 부호를 제거 시키는 작엄임
> 
> int의 원래 범위 -2147483648 ~ +2147483647  