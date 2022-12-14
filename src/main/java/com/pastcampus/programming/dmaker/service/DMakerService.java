package com.pastcampus.programming.dmaker.service;

import com.pastcampus.programming.dmaker.entity.Developer;
import com.pastcampus.programming.dmaker.repository.DeveloperRepository;
import com.pastcampus.programming.dmaker.type.DeveloperLevel;
import com.pastcampus.programming.dmaker.type.DeveloperSkillType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class DMakerService {
  private final DeveloperRepository developerRepository;

  @Transactional
  public void createDeveloper() {
    Developer developer = Developer.builder()
        .developerLevel(DeveloperLevel.JUNIOR)
        .developerSkillType(DeveloperSkillType.FRONT_END)
        .experienceYears(2)
        .name("Olaf")
        .age(5)
        .build();

    developerRepository.save(developer);
  }
}
