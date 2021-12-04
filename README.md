# 모의 지하철 노선도 구현


### 기능 목록


1. 지하철 역 조회, 등록, 삭제 기능  
- [등록할 이름을 입력받을 때 예외상황]
	- 중복된 이름
	- 빈 값
	- 2글자 미만 값 
- [삭제할 이름을 입력받을 때 예외상황]
	- 빈 값
	- 2글자 미만 값
	- 없는 역 이름

2. 지하철 노선 조회, 등록, 삭제 기능  
- [등록할 노선 이름 및 상행, 하행 종점역 이름을 입력받을 때 예외상황]
	- 중복된 이름
		- 등록할 노선의 이름이 이미 존재하는 경우
		- 상행, 하행 종점역 이름이 동일한 경우
	- 상행 또는 하행 종점역의 이름이 존재하지 않는 역의 이름인 경우
	- 빈 값
	- 2글자 미만 값 
	
	
- [삭제할 이름을 입력받을 때 예외상황]
	- 빈 값
	- 2글자 미만 값
	- 없는 노선 이름

3. 지하철 구간 조회, 등록, 삭제 기능
- [지하철 구간 등록시 예외상황]  
	- 순서가 범위를 벗어났을 경우
	- 노선 또는 역 이름을 입력할 때, 빈 값이나 존재하지 않는 이름의 대상을 입력했을 경우
	
	
- [지하철 구간 삭제시 예외상황]  
	- 노선에 포함된 역 두개 이하인 경우
	- 노선 또는 역 이름을 입력할 때, 빈 값이나 존재하지 않는 이름의 대상을 입력했을 경우

4. 전체 프로그램을 관리하는 기능