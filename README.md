# kotlin-blackjack

## 상태를 기준으로 진행되는 블랙잭 만들기

### 상태

- Start
  - FirstTurn : 게임 시작
  - hit : 카드를 한장 더 받음
- End
  - bust : 21 초과로 게임 종료
  - stay : 카드를 더이상 받지 않음
  - blackjack : 21로 게임 종료

### 기능목록

- [x] 시작 상태 : 카드를 한장 받는다.
- [x] hit 상태 : 카드를 추가로 받을 수 있다.
- [x] blackjack 상태 : 처음 두장의 합이 21이다.
- [x] bust 상태 : 카드의 합이 21점을 넘으면 죽는다.
- [x] stay 상태 : 카드를 그만 받고 게임 종료
