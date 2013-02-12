package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
taxonomy	TokenNameIdentifier
.	TokenNameDOT
writercache	TokenNameIdentifier
.	TokenNameDOT
lru	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
taxonomy	TokenNameIdentifier
.	TokenNameDOT
CategoryPath	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
NameHashIntCacheLRU	TokenNameIdentifier
extends	TokenNameextends
NameIntCacheLRU	TokenNameIdentifier
{	TokenNameLBRACE
NameHashIntCacheLRU	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
maxCacheSize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
maxCacheSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
Object	TokenNameIdentifier
key	TokenNameIdentifier
(	TokenNameLPAREN
CategoryPath	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Long	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
.	TokenNameDOT
longHashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
Object	TokenNameIdentifier
key	TokenNameIdentifier
(	TokenNameLPAREN
CategoryPath	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
prefixLen	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Long	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
.	TokenNameDOT
longHashCode	TokenNameIdentifier
(	TokenNameLPAREN
prefixLen	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE