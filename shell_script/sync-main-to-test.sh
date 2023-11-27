#!/bin/bash

# 주 소스 디렉토리
MAIN_SRC=../src/main/java

# 테스트 소스 디렉토리
TEST_SRC=../src/test/java

# 주 소스 패키지 목록 얻기
PACKAGES=$(find $MAIN_SRC -type d)

# 각 패키지 별로 테스트 패키지 생성
for package in $PACKAGES; do

  # src/main/java 부분 제거
  rel_path=${package#$MAIN_SRC}

  # 테스트 소스 디렉토리에 동일 구조 생성
  mkdir -p $TEST_SRC$rel_path
done
