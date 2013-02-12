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
File	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
FSLockFactory	TokenNameIdentifier
extends	TokenNameextends
LockFactory	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
File	TokenNameIdentifier
lockDir	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
void	TokenNamevoid
setLockDir	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
lockDir	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
lockDir	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalStateException	TokenNameIdentifier
(	TokenNameLPAREN
"You can set the lock directory for this factory only once."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
lockDir	TokenNameIdentifier
=	TokenNameEQUAL
lockDir	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
File	TokenNameIdentifier
getLockDir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
lockDir	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
