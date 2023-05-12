# DEV-GRAFT Cinema

DEV-GRAFT가 영화관 운영을 시작했습니다!  
그리고 우리 DG-MOVIE.Team은 영화관 서비스에 필요한 영화 예매 플랫폼을 개발해야합니다!

- [Event Storming](https://miro.com/app/embed/uXjVOx1AX14=/?pres=1&frameId=3458764553420482599&embedId=695691095149)
- [API 문서]()

## 🎭 시나리오

시나리오를 간략하게 설명하는 것으로 변경할 예정.

언어,아키텍쳐,프레임워크,인프라를 제한할 생각.
리뷰 목적, 시나리오 집중 등의 이유.

### Flow

Flow Image 추가 예정

### 📚 전제 조건
- 테이블 및 기본데이터 .sql 파일로 제공하였습니다.

### ⛳ Goals
- ✅ 시나리오의 API를 구현합니다.
- ✅ 프로젝트 구조와 컨벤션을 고민하고 다른 참가자와 공유할 수 있도록 합니다.
- ✅ 결제 과정에 내가 선택한 좌석을 다른 사용자가 예매할 수 없도록 제한할 수 있어야합니다.
- ✅ 결제가 완료된 예매 정보를 예매율에 반영할 수 있어야합니다.
- ✅ 대규모 트래픽을 고려하여 예매율을 실시간으로 보여줄 수 있어야합니다.

### 예매 관련 정보

- 상영 직전까지(1분 전) 예매가 가능해야합니다.
- 조회시간 기준으로 상영된지 2시간이상 지난 예매 데이터를 실시간 집계하여 예매율 정보로 제공합니다.

```
예매율 산출기준 = A(예매관객수) / B(전체 예매 관객수) * 100
- 예매 관객수(A) : 조회 시점 특정 영화의 상영이 2시간이상 지난 발권 데이터
- 전체 예매 관객수 (B) 조회 시점 모든 영화의 상영이 2시간 이상 지난 발권 데이터
- 상영 시작시간을 기준으로 2시간 이내의 발권 데이터는 집계 대상에서 제외됩니다.
```
