package meng.xing.repository;

import meng.xing.entity.Exam;
import meng.xing.entity.Subject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/7/23.
 */
@Repository
@RepositoryRestResource(exported = false) //不是rest风格的资源，不能通过url直接获取。必须从controller访问
public interface ExamRepository extends JpaRepository<Exam, Long> {
    Page<Exam> findAll(Pageable pageable);

    Page<Exam> findBySubject(Subject subject, Pageable pageable);

    List<Exam> findAllBySubject(Subject subject, Pageable pageable);

}
