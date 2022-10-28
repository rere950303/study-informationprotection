# 접근 방법
1. 문제에서 주어진 모든 가정과 전제 조건을 숙지하고 있다고 가정한다.
2. ciphertext를 25 letters씩 5개의 block으로 나눈다.
3. 프로그래밍을 통해 block 사이의 관계를 이용하여 offset과 Ni을 구한다.
4. 구한 Ni을 이용하여 ciphertext를 decrypt 한다.
5. 여러 가지의 Ni가 가능한 digit의 경우 decrypt된 plaintext의 문맥을 고려하여 후보를 줄여나간다.
6. 특히 문제에서 주어진 Bigram frequencies에서 가장 높은 비율을 가진 `TH`을 우선적으로 고려해 본다.
7. 위와 같은 과정을 반복하여 문제를 해결한다.

# offset과 특정 digit의 Ni 구하기
- 먼저 첫 번째 block과 두 번째 block의 1~16 digit을 생각해 보자.
- 각 digit에는 같은 Ni가 사용된 것이므로 각 digit 별로 가능한 Ni와 이에 대응되는 offset를 나열해 본다.
- 이때 6번째 digit에는 하나의 후보만이 존재하게 되는데 i는 17이고 offset은 6이 된다.
- 이를 고려하여 다른 digit도 Ni를 특정한다.

# ciphertext에서 plaintext로의 decrypt
- 위에서 구한 Ni와 offset을 이용하여 문제에서 주어진 ciphertext를 decrypt 한다.
- plaintext를 보면 `information`, `structure`과 같은 문맥상 쉽게 파악할 수 있는 단어를 유추할 수 있다.

# 특정되지 않는 Ni의 추론
- 위에서 언급한 바와 같이 특정 단어를 유추할 수 있는데 이를 이용하여 각 digit의 Ni의 후보를 줄여나갈 수 있다.
- 특정 digit에서 사용된 Ni를 일정하고 offset은 6으로 알고 있으므로 5개의 block의 동일한 digit과 이에 대응되는 ciphertext의 digit 과의 관계를 고려하여 Ni를 구한다.
- 이와 같은 과정을 통해 3, 7, 8, 16, 17, 18, 22 등의 digit의 Ni를 구할 수 있다.

# 위와 같은 과정의 반복
- 특정 지을 수 있는 Ni를 통해 ciphertext를 decrypt 하고 decrypt된 plaintext에서 다시 문맥상 단어를 유추한다.
- 이후의 과정은 위와 같으며 계속하여 Ni를 특정해나간다.

# Bigram frequencies 이용
- 위와 같은 과정을 반복해도 쉽게 특정되지 않는 구간이 존재하는데 바로 23, 24 digit이다.
- 이때 문제에서 주어진 빈도를 이용할 수 있는데 가장 높은 빈도를 가지는 단어가 바로 `TH`이다.
- 뒤에 존재하는 `E`와 결합했을 때 `THE`라는 그럴싸한 영어 단어를 이루게 된다.
- 따라서 위와 같은 추론을 통해 해당 digit의 Ni를 구하게 되면 성공적으로 문제를 해결할 수 있게 된다.