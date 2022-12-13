package com.pastcampus.programming.dmaker.entity;

import com.pastcampus.programming.dmaker.type.DeveloperLevel;
import com.pastcampus.programming.dmaker.type.DeveloperSkillType;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Developer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected Long id;

  @Enumerated(EnumType.STRING)
  private DeveloperLevel developerLevel;

  @Enumerated(EnumType.STRING)
  private DeveloperSkillType developerSkillType;

  private Integer experienceYears;
  private String memberId;
  private String name;
  private Integer age;

  //Spring Data JPA에서 자동으로 값을 셋팅해준다. (JPA Auditing이 해준다.)
  // main에 @EnableJpaAuditing를 붙여야 한다.
  // Entity에 @EntityListeners(AuditingEntityListener.class)
  @CreatedDate
  private LocalDateTime createdAt;

  @LastModifiedDate //Spring Data JPA에서 자동으로 값을 셋팅해준다.
  private LocalDateTime updateAt;

}
