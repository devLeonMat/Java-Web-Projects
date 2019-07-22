package com.file.admin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.file.admin.entity.File;

@Repository
public interface FileRepository extends CrudRepository<File, Long>{

}
