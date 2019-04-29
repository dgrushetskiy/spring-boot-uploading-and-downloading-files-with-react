package ru.gothmog.rest.downloadfile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gothmog.rest.downloadfile.model.FileEntity;

@Repository
public interface FileEntityRepository extends JpaRepository<FileEntity,Long> {
}
