package com.boot.gugi.repository;

import com.boot.gugi.model.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DiaryRepository extends JpaRepository<Diary, UUID> {
    Optional<Diary> findByDiaryId(UUID diaryId);

    List<Diary> findByUserId(UUID userId);

    @Transactional
    void deleteAllByUserId(UUID userId);
}