package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
transcoder	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
interface	TokenNameinterface
Transcoder	TokenNameIdentifier
{	TokenNameLBRACE
void	TokenNamevoid
transcode	TokenNameIdentifier
(	TokenNameLPAREN
TranscoderInput	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
TranscoderOutput	TokenNameIdentifier
output	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
TranscoderException	TokenNameIdentifier
;	TokenNameSEMICOLON
TranscodingHints	TokenNameIdentifier
getTranscodingHints	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
addTranscodingHint	TokenNameIdentifier
(	TokenNameLPAREN
TranscodingHints	TokenNameIdentifier
.	TokenNameDOT
Key	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
removeTranscodingHint	TokenNameIdentifier
(	TokenNameLPAREN
TranscodingHints	TokenNameIdentifier
.	TokenNameDOT
Key	TokenNameIdentifier
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
setTranscodingHints	TokenNameIdentifier
(	TokenNameLPAREN
Map	TokenNameIdentifier
hints	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
setTranscodingHints	TokenNameIdentifier
(	TokenNameLPAREN
TranscodingHints	TokenNameIdentifier
hints	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
setErrorHandler	TokenNameIdentifier
(	TokenNameLPAREN
ErrorHandler	TokenNameIdentifier
handler	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ErrorHandler	TokenNameIdentifier
getErrorHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE