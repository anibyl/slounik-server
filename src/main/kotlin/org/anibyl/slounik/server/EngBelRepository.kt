package org.anibyl.slounik.server

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * @author Usievaład Kimajeŭ
 * @created 23.12.2017
 */
@Repository
interface EngBelRepository : CrudRepository<EngBelEntity, Long> {
	@Query(value = "SELECT * FROM engbel WHERE title ~* ('\\m' || ?1 || '\\M');", nativeQuery = true)
	fun findInTitle(word: String): List<EngBelEntity>

	@Query(value = "SELECT * FROM engbel WHERE title ~* ('\\m' || ?1 || '\\M') OR description ~* ('\\m' || ?1 || '\\M');", nativeQuery = true)
	fun findInTitleOrDescription(word: String): List<EngBelEntity>
}
