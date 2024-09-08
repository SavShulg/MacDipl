package ru.skypro.homework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.entity.Add;

import java.util.List;

@Repository
public interface AddsRepository extends JpaRepository<Add, Long> {
    List<Add> findAddByAuthorUserName(String email);
}
