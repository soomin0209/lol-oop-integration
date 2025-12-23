# LoL 1:1 결투 모드 - 통합 프로젝트
## 🐰 달리기반
### 필수 구현

<details>
<summary><strong>1. Champion 추상 클래스 완성</strong></summary>

- 공통 필드: name, level, hp, attackDamage, defense
- 공통 메서드: basicAttack(), takeDamage(), levelUp()
- 추상 메서드: useQ()

</details>

<details>
<summary><strong>2. 챔피언 2명 이상 구현</strong></summary>

- 각 클래스는 useQ() 내용을 다르게 정의
- 원하는 만큼 스킬 데미지/특수효과 추가 가능

</details>

<details>
<summary><strong>3. static / final 활용</strong></summary>

- Champion 생성 시 createdCount 증가
- GameConstants 클래스에 상수 포함 (MAX_LEVEL, BASE_CDR 등 자유롭게)

</details>

<details>
<summary><strong>4. ChampionPool(Map) 구현</strong></summary>

- 이름으로 챔피언 조회 가능
- Optional<Champion> 기반 안전 조회

</details>

<details>
<summary><strong>5. SafeBattle(전투 모듈) 구현</strong></summary>

- 공격/스킬 턴 진행
- 사망자 행동 시 커스텀 예외 처리 (DeadChampionActionException 등)

</details>

<details>
<summary><strong>6. 최종 "1:1 결투 모드" 실행 클래스</strong></summary>

- 챔피언 Pool 생성
- 사용자 입력 또는 랜덤 선택으로 2명 선택
- 안전 전투(SafeBattle) 진행
- 승패 또는 전투 종료 메시지 출력
- 모든 출력은 콘솔 기반이면 충분함

</details>

### 선택 구현
