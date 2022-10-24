package com.containstudy.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * Member 테이블 엔티티
 */

@Data     // 클래스에 부여하는 것으로, 전 필드에 대해 getter/setter로 액세스할 수 있습니다. hashCode(), equals(), toString()도 자동생성
@NoArgsConstructor  //클래스에 부여하는 것으로, 기본 생성자가 자동 생성됨
@AllArgsConstructor //클래스에 부여하는 것으로, 전 필드에 대해 초기화 값을 인수로 가지는 생성자가 자동 생성됨
public class Member {
    /** Member 번호 */
    @Id
    private Integer id;
    /** Member 이름 */
    private String name;
}
