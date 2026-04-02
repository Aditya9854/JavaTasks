package com.sb.main.repository;

import com.sb.main.entity.DocumentMetadata;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<DocumentMetadata,Long>
{
}
