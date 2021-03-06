package fi.academy.hojto;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface MessageRepository extends CrudRepository<Message, Integer> {

    List<Message> findByTopicId(Topic topicId); //hakee messaget topicId:n perusteella @Olli
    List<Message> findByContentContains(String content);

    @Modifying
    Optional<Message> deleteMessageById(int id);
}




