package happy.mjstudio.paging.domain.usecase

import happy.mjstudio.paging.domain.entity.Feed
import happy.mjstudio.paging.domain.repository.FeedRepository
import javax.inject.Inject

/**
 * Created by mj on 25, November, 2019
 */
class FeedListUseCase @Inject constructor(private val feedRepository: FeedRepository) : CoroutineUseCase<List<Feed>, FeedListUseCase.Param> {
    override suspend fun execute(param: Param): List<Feed> {
        return feedRepository.listFeed(param.limit)
    }

    data class Param(val limit : Int)
}