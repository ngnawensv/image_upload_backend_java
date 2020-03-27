package cm.belrose.imageupload.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cm.belrose.imageupload.entities.ImageModel;

public interface IImageModelDao extends JpaRepository<ImageModel, Long> {
	
    Optional<ImageModel> findByName(String name);


}
