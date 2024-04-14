# 코틀린
___

## 변수, 타입, 연산자
1. 변수를 다루는 방법
2. null을 다루는 방법
   - null 체크
   - Safe Call & Elvis
   - NULL 아님
   - 플랫폼 타입
3. Type을 다루는 방법
   - 기본 타입
     - toLong()과 같은 형태로 캐스팅
   - 타입 캐스팅 (기본 타입이 아닐 때)
     - 스마트 캐스트
     - java에서 instanceOf를 kotlin에선 is를 사용
     - (!(obj instanceOf Person)) => obj !is Person
     - is, !is, as, as?
     - Any : java의 Object와 동일한 역할
     - Unit : java의 void와 동일한 역할
     - Nothing : 무조건 예외를 반환하는 함수 / 무한 루프 함수 등
     - String interpolation & String indexing : ${ } 
        - Don't use curly braces when inserting a simple variable into a string template. Use curly braces only for longer expressions
     - 특정 문자는 배열처럼 [0]
4. 연산자를 다루는 방법

## 제어