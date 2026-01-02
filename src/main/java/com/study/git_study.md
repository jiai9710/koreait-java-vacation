# git이란?
- 파일 버전 관리 툴(소프트웨어)

## git 명령어
1. 로컬환경 셋팅
- 내 프로젝트를 git이 추적하게 함 : git init
- 현재 프로젝트 작업자의 서명 등록 : 
  - git config (--global(모든 프로젝트)) user.name 내 아이디  # 괄호는 옵션
- git config user.email 내 이메일

2. 변경사항 저장
- 변경사항에 대해 임시영역에 저장(=스테이징 영역에 올린다) : git add
- 모든 변경사항(빨간글자 파일)을 임시영역에 저장 : git add .