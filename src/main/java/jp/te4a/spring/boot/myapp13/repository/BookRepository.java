package jp.te4a.spring.boot.myapp13.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.te4a.spring.boot.myapp13.bean.BookBean;
public interface BookRepository extends JpaRepository<BookBean, Integer>{
}