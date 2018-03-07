
1. JDK (Java SE Development Kit 8 Downloads) 설치



Google 에 jdk 검색 또는 http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html 링크 클릭



다음 이미지 처럼, 라이센스 동의 후, 다운로드 진행 



※ 운영체제에 맞게 설치하세요! 제가 진행하는 실습 환경은 window 64bit 









특이 사항 없이 next 진행 후 설치하시면 됩니다. 





2. JAVA 환경 변수 설정 



1. 설치가 완료 됬다면, 이제는 JAVA 환경 변수 설정을 해줘야 됩니다. 



제어판 -> 시스템 및 보안 -> 시스템 -> 고급 시스템 설정 클릭하세요.







2. 시스템 설정 클릭 후, 환경변수 클릭 









3. 다음 화면에서 새로 만들기 클릭 









4. 새로 만들기 클릭 후 나온 화면을 잠시 나두고, jdk 가 설치된 경로를 찾아 복사합니다. 

※ 대부분의 경로는 C: --> Program Files --> JAVA --> JDK 다운로드 받은 버전 











5. 잠시 보류했던 화면으로 돌아와 변수이름에  JAVA_HOME 입력 , 변수 값 부분에 조금 전 복사 했던 경로 붙여넣기 입력 -> 확인 







6. 확인 완료 후, 마지막으로 아래 이미지와 같이 순서대로 진행하면 된다.



1. 시스템 변수 Path 클릭 

2. 새로 만들기 클릭

3. 좀 전에 만들었던 JAVA_HOME 활용하여 %JAVA_HOME%\bin 설정 해주면 끝









3. 자바 jdk 정상설치 확인하기



실행창(윈도우+R)을 열어 cmd입력 후 java -version 을 입력하면 

1.8.0_111이 나오는 것을 확인할 수 있습니다.











4. Eclipse 설치 방법 



Java를 설치 완료했으니 이제 java를 사용할 에디터인 eclipse를 다운받습니다.

 

http://www.eclipse.org/downloads/

 

위 링크에 접속 후

 



 

 

DOWNLOAD 64BIT가 아닌!! 그 아래 작은글씨 Download Packages를 다운받습니다.

 

 



 

Java EE Developer를 다운받을 것임으로 운영체제에 맞추어 다운받습니다.

 

 

 



 

이클립스를 실행하게되면 워크스페이스가 저장될 경로를 묻는데 편한 경로로 바꿔줍니다.

저는 아까 만든 C\JAVA_STUDY로 지정했습니다.

설정 후 OK 를 누루면 다음과 같이 이클립스가 실행됩니다.







모든 설치가 완료 됬으니 new project 를 통해 JAVA 코딩 시작 하시면 됩니다.

