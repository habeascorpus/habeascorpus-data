package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
LockFactory	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
lockPrefix	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setLockPrefix	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
lockPrefix	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
lockPrefix	TokenNameIdentifier
=	TokenNameEQUAL
lockPrefix	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getLockPrefix	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
this	TokenNamethis
.	TokenNameDOT
lockPrefix	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
Lock	TokenNameIdentifier
makeLock	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
lockName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
abstract	TokenNameabstract
public	TokenNamepublic
void	TokenNamevoid
clearLock	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
lockName	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE