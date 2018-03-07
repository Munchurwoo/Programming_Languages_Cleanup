<p><b><span style="font-size: 14pt;"><br /></span></b></p>
<p><b><span style="font-size: 14pt;">1. JDK (</span><span style="font-size: 14pt;">Java SE Development Kit 8 Downloads)&nbsp;</span><span style="font-size: 14pt;">설치 </span></b></p>
<p></p><hr><p></p>
<p><br /></p>
<p>Google 에 jdk 검색 또는&nbsp;<a href="http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html" target="_blank" class="tx-link">http://img1.daumcdn.net/thumb/R1920x0/?fname=http%3A%2F%2Fcfile24.uf.tistory.com%2Fimage%2F99183E335A9F76DC06F21D</a>링크 클릭</p>

<p><br /></p>
<p>다음 이미지 처럼, 라이센스 동의 후, 다운로드 진행&nbsp;</p>
<p><br /></p>
<p>※ 운영체제에 맞게 설치하세요! 제가 진행하는 실습 환경은 window 64bit&nbsp;</p>
<p><br /></p>
<p style="text-align: center; clear: none; float: none;">[##_1N|cfile24.uf@99183E335A9F76DC06F21D.jpg|width="900" height="629" filename="캡처.jpg" filemime="image/jpeg"|_##]</p>
<p><br /></p>
<p><br /></p>
<p>특이 사항 없이 next 진행 후 설치하시면 됩니다.&nbsp;</p>
<p><br /></p>
<p><br /></p>
<p><span style="font-size: 14pt;"><b>2. JAVA 환경 변수 설정&nbsp;</b></span><br /></p><hr><p><span style="font-size: 14pt;"><br /></span></p>
<p>1. 설치가 완료 됬다면, 이제는 JAVA 환경 변수 설정을 해줘야 됩니다.&nbsp;</p>
<p><br /></p>
<p>제어판 -&gt; 시스템 및 보안 -&gt; 시스템 -&gt; 고급 시스템 설정 클릭하세요.</p>
<p><br /></p>
<p style="text-align: center; clear: none; float: none;">[##_1N|cfile10.uf@992F4A505A9F788E08793C.jpg|width="900" height="293" filename="캡처.jpg" filemime="image/jpeg"|_##]</p>
<p><br /></p>
<p>2. 시스템 설정 클릭 후, 환경변수 클릭&nbsp;</p>
<p><br /></p>
<p style="text-align: center; clear: none; float: none;">[##_1N|cfile26.uf@996B663C5A9F7CC01CA144.jpg|width="601" height="688" filename="캡처.jpg" filemime="image/jpeg"|_##]</p>
<p><br /></p>
<p><br /></p>
<p>3. 다음 화면에서 새로 만들기 클릭&nbsp;</p>
<p><br /></p>
<p style="text-align: center; clear: none; float: none;">[##_1N|cfile7.uf@99EB0A365A9F7D581DDF77.jpg|width="775" height="767" filename="캡처1.jpg" filemime="image/jpeg"|_##]</p>
<p><br /></p>
<p><br /></p>
<p>4. 새로 만들기 클릭 후 나온 화면을 잠시 나두고, jdk 가 설치된 경로를 찾아 복사합니다.&nbsp;</p>
<p><b>※ 대부분의 경로는 C: --&gt; Program Files --&gt; JAVA --&gt; JDK 다운로드 받은 버전&nbsp;</b></p>
<p><br /></p>
<p style="text-align: center; clear: none; float: none;">[##_1N|cfile3.uf@9971F1395A9F7C5323801D.jpg|width="900" height="437" filename="캡처2.jpg" filemime="image/jpeg"|_##]</p>
<p><br /></p>
<p><br /></p>
<p><br /></p>
<p>5. 잠시 보류했던 화면으로 돌아와 변수이름에 &nbsp;JAVA_HOME 입력 , 변수 값 부분에 조금 전 복사 했던 경로 붙여넣기 입력 -&gt; 확인&nbsp;</p>
<p><br /></p>
<p style="text-align: center; clear: none; float: none;">[##_1N|cfile2.uf@994F17365A9F7DDC1896CA.jpg|width="822" height="209" filename="캡처3.jpg" filemime="image/jpeg"|_##]</p>
<p><br /></p>
<p>6. 확인 완료 후, 마지막으로 아래 이미지와 같이 순서대로 진행하면 된다.</p><hr class="tx-hr-border-3" style="display:block; border: black 0 none; border-top: black 1px dotted; height: 1px"><p><br /></p>
<p>1. 시스템 변수 Path 클릭&nbsp;</p>
<p>2. 새로 만들기 클릭</p>
<p>3. 좀 전에 만들었던 JAVA_HOME 활용하여 <b>%JAVA_HOME%\bin</b> 설정 해주면 끝</p>
<p><br /></p>
<p style="text-align: center; clear: none; float: none;">[##_1N|cfile8.uf@9901D0335A9F7E5D2C59C4.jpg|width="900" height="547" filename="캡처4.jpg" filemime="image/jpeg"|_##]</p>
<p><b><br /></b></p>
<p><b><br /></b></p>
<p><strong style="color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 16px; text-align: center;"><span style="font-size: 14pt; font-family: &quot;맑은 고딕&quot;, sans-serif; color: rgb(0, 0, 0);">3. 자바 jdk 정상설치 확인하기</span></strong></p><hr><p><strong style="color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 16px; text-align: center;"><span style="font-size: 14pt; font-family: &quot;맑은 고딕&quot;, sans-serif;"><br /></span></strong></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: left; clear: none;"><span style="font-size: 10pt;"><span style="font-family: &quot;맑은 고딕&quot;, sans-serif; color: rgb(0, 0, 0);">실행창(윈도우+R)을 열어 cmd입력 후</span></span><strong><span style="font-size: 10pt;"><span style="font-family: &quot;맑은 고딕&quot;, sans-serif; color: rgb(0, 0, 0);">&nbsp;</span><span style="font-family: &quot;맑은 고딕&quot;, sans-serif; color: rgb(0, 0, 0);">java -version</span><span style="font-family: &quot;맑은 고딕&quot;, sans-serif; color: rgb(0, 0, 0);">&nbsp;</span></span></strong><span style="font-size: 10pt; font-family: &quot;맑은 고딕&quot;, sans-serif; color: rgb(0, 0, 0);">을 입력하면</span><strong><span style="font-size: 10pt; font-family: &quot;맑은 고딕&quot;, sans-serif; color: rgb(0, 0, 0);">&nbsp;</span></strong></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: left; clear: none;"><strong><span style="font-size: 10pt; font-family: &quot;맑은 고딕&quot;, sans-serif; color: rgb(0, 0, 0);">1.8.0_111</span></strong><span style="font-size: 10pt; font-family: &quot;맑은 고딕&quot;, sans-serif; color: rgb(0, 0, 0);">이 나오는 것을 확인할 수 있습니다.</span></p><br style="color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px;"><p style="text-align: center; clear: none; float: none;">[##_1N|cfile24.uf@991D02375A9F8352076DD3.jpg|width="694" height="149" filename="캡처.jpg" filemime="image/jpeg"|_##]</p>
<p><br /></p><br style="color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px;"><p><br /></p>
<p><span style="font-size: 14pt;"><br /></span></p>
<p><span style="font-size: 14pt;"><b>4. Eclipse 설치 방법&nbsp;</b></span><br /></p><hr><p><br /></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;">Java를 설치 완료했으니 이제</span><strong><span style="font-size: 10pt;">&nbsp;java를 사용할 에디터인 eclipse</span></strong><span style="font-size: 10pt;">를 다운받습니다.</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;">&nbsp;</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><a href="http://www.eclipse.org/downloads/" style="color: rgb(51, 51, 51);"><span style="font-size: 10pt;">http://www.eclipse.org/downloads/</span></a></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;">&nbsp;</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;">위 링크에 접속 후</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;">&nbsp;</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span class="imageblock" style="display: inline-block; width: 305px; height: auto; max-width: 100%;"><span data-url="http://cfile5.uf.tistory.com/attach/266686425878E4C429F88B" data-lightbox="lightbox"><img src="http://cfile5.uf.tistory.com/image/266686425878E4C429F88B" width="305" height="229" filename="1515.jpg" filemime="image/jpeg" style="border: 0px none; cursor: pointer; max-width: 100%; height: auto;"></span></span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;">&nbsp;</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;">&nbsp;</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;">DOWNLOAD 64BIT가</span><strong><span style="font-size: 10pt;">&nbsp;아닌!!&nbsp;</span></strong><span style="font-size: 10pt;">그 아래 작은글씨</span><strong><span style="font-size: 10pt;">&nbsp;Download Packages</span></strong><span style="font-size: 10pt;">를 다운받습니다.</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;">&nbsp;</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;">&nbsp;</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span class="imageblock" style="display: inline-block; width: 628px; height: auto; max-width: 100%;"><span data-url="http://cfile9.uf.tistory.com/attach/2139FF445878E5401C7FA7" data-lightbox="lightbox"><img src="http://cfile9.uf.tistory.com/image/2139FF445878E5401C7FA7" width="628" height="121" filename="1616.jpg" filemime="image/jpeg" style="border: 0px none; cursor: pointer; max-width: 100%; height: auto;"></span></span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;">&nbsp;</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;">Java EE Developer를 다운받을 것임으로 운영체제에 맞추어 다운받습니다.</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;">&nbsp;</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;">&nbsp;</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;">&nbsp;</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span class="imageblock" style="display: inline-block; width: 493px; height: auto; max-width: 100%;"><span data-url="http://cfile24.uf.tistory.com/attach/21567735587A1EB326EE9F" data-lightbox="lightbox"><img src="http://cfile24.uf.tistory.com/image/21567735587A1EB326EE9F" width="493" height="229" filename="캡처.jpg" filemime="image/jpeg" style="border: 0px none; cursor: pointer; max-width: 100%; height: auto;"></span></span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;">&nbsp;</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;">이클립스를 실행하게되면 워크스페이스가 저장될&nbsp;경로를 묻는데 편한 경로로 바꿔줍니다.</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; text-align: center;"></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;">저는 아까 만든 C\JAVA_STUDY로 지정했습니다.</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; float: none; text-align: center; clear: none;"><span style="font-size: 13.3333px;">설정 후 OK 를 누루면 다음과 같이 이클립스가 실행됩니다.</span></p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;">[##_1N|cfile30.uf@994B003D5A9F82C834D6E3.jpg|width="700" height="475" filename="캡처.jpg" filemime="image/jpeg" style="width: 700px; height: 475px;"|_##]</p>
<p style="margin-right: 0px; margin-left: 0px; padding: 0px; outline: none; color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px; float: none; text-align: center; clear: none;"><span style="font-size: 10pt;"><br /></span></p>
<p style="text-align: center;"><br style="color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px;"><br style="color: rgb(102, 102, 102); font-family: &quot;Noto Sans&quot;, sans-serif; font-size: 14px;">모든 설치가 완료 됬으니 new project 를 통해 JAVA 코딩 시작 하시면 됩니다.</p>
<p style="text-align: center;"><br /></p>
