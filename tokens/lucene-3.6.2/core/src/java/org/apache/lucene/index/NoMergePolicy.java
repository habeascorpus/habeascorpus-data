package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
NoMergePolicy	TokenNameIdentifier
extends	TokenNameextends
MergePolicy	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
MergePolicy	TokenNameIdentifier
NO_COMPOUND_FILES	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
NoMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
MergePolicy	TokenNameIdentifier
COMPOUND_FILES	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
NoMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
boolean	TokenNameboolean
useCompoundFile	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
NoMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
useCompoundFile	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
useCompoundFile	TokenNameIdentifier
=	TokenNameEQUAL
useCompoundFile	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
MergeSpecification	TokenNameIdentifier
findMerges	TokenNameIdentifier
(	TokenNameLPAREN
SegmentInfos	TokenNameIdentifier
segmentInfos	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
CorruptIndexException	TokenNameIdentifier
,	TokenNameCOMMA
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
MergeSpecification	TokenNameIdentifier
findForcedMerges	TokenNameIdentifier
(	TokenNameLPAREN
SegmentInfos	TokenNameIdentifier
segmentInfos	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
maxSegmentCount	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
<	TokenNameLESS
SegmentInfo	TokenNameIdentifier
,	TokenNameCOMMA
Boolean	TokenNameIdentifier
>	TokenNameGREATER
segmentsToMerge	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
CorruptIndexException	TokenNameIdentifier
,	TokenNameCOMMA
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
MergeSpecification	TokenNameIdentifier
findForcedDeletesMerges	TokenNameIdentifier
(	TokenNameLPAREN
SegmentInfos	TokenNameIdentifier
segmentInfos	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
CorruptIndexException	TokenNameIdentifier
,	TokenNameCOMMA
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
useCompoundFile	TokenNameIdentifier
(	TokenNameLPAREN
SegmentInfos	TokenNameIdentifier
segments	TokenNameIdentifier
,	TokenNameCOMMA
SegmentInfo	TokenNameIdentifier
newSegment	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
useCompoundFile	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
setIndexWriter	TokenNameIdentifier
(	TokenNameLPAREN
IndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"NoMergePolicy"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE