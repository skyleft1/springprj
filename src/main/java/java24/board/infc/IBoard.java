package java24.board.infc;

import java.util.HashMap;
import java.util.List;

import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachFile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public interface IBoard {
String getBoardName(String boardcd) ;
    
    List<ModelBoard> getBoardOnes(String boardcd) ;
    
    List<ModelBoard> getBoardList() ;
    
    List<ModelBoard> getBoardListResultMap() ;
    
    HashMap bbsResultMap();
    
    List<ModelBoard > getBoardCustomMap();  // 리졸트 맵?
    
    int insertBoard(ModelBoard board ) ;
    
    int updateBoard(ModelBoard searchValue_board, ModelBoard updateValue_board );
    
    int deleteBoard(ModelBoard board );
    
    List<ModelBoard> getBoardSearch(ModelBoard board ) ;
    
    List<ModelBoard> getBoardPaging(ModelBoard boardcd_board, ModelBoard searchWord_board );
    
    int insertBoardList(List list );
    
    int getArticleTotalRecord(ModelBoard boardcd_board, ModelBoard searchWord_board) ;
    
    ModelArticle getArticleList(ModelBoard boardcd_board, ModelBoard searchWord_board) ;
    
    ModelArticle getArticle(int articleNo);
    
    int insertArticle(ModelArticle article);
    
    int updateArticle(ModelBoard searchValue_board, ModelBoard updateValue_board);
    
    int deleteArticle(ModelArticle article);
    
    int increaseHit(int articleNo);
    
    ModelArticle getNextArticle(ModelArticle article, HashMap searchWord);
   
    
    ModelArticle getPrevArticle(ModelArticle article, HashMap searchWord);
   
    
    ModelAttachFile getAttachFile(int attachFileNo);
    
    List<ModelAttachFile> getAttachFileList(int articleNo);
    
    int insertAttachFile(ModelAttachFile attachfile);
    
    int deleteAttachFile(ModelAttachFile attachfile);
    
    ModelComments getComment(int commentNo);
    
    List<ModelComments> getCommentList(int articleNo);
    
    int insertComment(ModelComments comments);
    
    List<ModelComments> updateComment(ModelComments updateValue, ModelComments searchValue);
    
    int deleteComment(ModelComments comments );
}
