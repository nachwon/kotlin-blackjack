# kotlin-blackjack

## 🚀 2단계 - 블랙잭

### Card
- [x] 카드는 문양과 번호를 가진다.

### CardNumber
- [x] 번호를 가진다.
- [x] 범위를 벗어나는 번호를 받으면 에러를 일으킨다.

### CardDeck
- [x] 덱은 총 52장의 카드를 가진다.
- [x] 덱은 문양별로 1에서 13번 까지의 카드를 가진다.
- [x] 덱에서 카드 한장을 뽑을 수 있다.
- [x] 덱에서 카드 여러장을 뽑을 수 있다.

### Player
- [x] 플레이어는 이름을 가진다.
- [x] 플레이어의 덱에 카드를 추가할 수 있다.
- [x] 플레이어가 가진 카드들의 점수를 확인할 수 있다.

### PlayerDeck
- [x] 플레이어 덱에 카드를 추가할 수 있다.
- [x] 플레이어 덱의 점수를 확인할 수 있다.
- [x] 점수 계산 시 코트 카드는 10점으로 계산한다.
- [x] 점수 계산 시 에이스 카드는 1점 또는 11점으로 계산한다.

### BlackJack
- [x] 블랙잭은 플레이어와 카드 덱을 가진다.
- [x] 동일한 이름의 플레이어를 받으면 에러를 일으킨다.
- [x] 최소 두 명 이상의 플레이어를 받지 않으면 에러를 일으킨다.
- [x] 게임을 시작하면 각 플레이어에게 두 장의 카드를 지급한다.
- [x] 한 플레이어가 새로운 카드 한 장을 받을 수 있다.
